package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HorizontalRotateClockwise: ImageVector
    get() {
        if (_HorizontalRotateClockwise != null) {
            return _HorizontalRotateClockwise!!
        }
        _HorizontalRotateClockwise = ImageVector.Builder(
            name = "HorizontalRotateClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                lineTo(8f, 10f)
                lineTo(4f, 14f)
                horizontalLineTo(7.1f)
                curveTo(7.56f, 18.56f, 9.58f, 22f, 12f, 22f)
                reflectiveCurveTo(16.44f, 18.56f, 16.9f, 14f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20f, 12f, 20f)
                reflectiveCurveTo(9.43f, 17.45f, 9.09f, 14f)
                horizontalLineTo(12f)
                moveTo(12f, 4f)
                curveTo(13.4f, 4f, 14.57f, 6.55f, 14.91f, 10f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2f, 12f, 2f)
                curveTo(9.84f, 2f, 8f, 4.74f, 7.3f, 8.58f)
                lineTo(8f, 7.88f)
                lineTo(9.21f, 9.08f)
                curveTo(9.64f, 6.11f, 10.73f, 4f, 12f, 4f)
                moveTo(22f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                lineTo(13f, 13f)
                horizontalLineTo(22f)
                moveTo(2f, 13f)
                horizontalLineTo(3f)
                lineTo(5f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _HorizontalRotateClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _HorizontalRotateClockwise: ImageVector? = null
