package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HorizontalRotateCounterclockwise: ImageVector
    get() {
        if (_HorizontalRotateCounterclockwise != null) {
            return _HorizontalRotateCounterclockwise!!
        }
        _HorizontalRotateCounterclockwise = ImageVector.Builder(
            name = "HorizontalRotateCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                horizontalLineTo(9.09f)
                curveTo(9.43f, 6.55f, 10.6f, 4f, 12f, 4f)
                reflectiveCurveTo(14.57f, 6.55f, 14.91f, 10f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 5.44f, 14.42f, 2f, 12f, 2f)
                reflectiveCurveTo(7.56f, 5.44f, 7.1f, 10f)
                horizontalLineTo(4f)
                lineTo(8f, 14f)
                lineTo(12f, 10f)
                moveTo(12f, 20f)
                curveTo(10.73f, 20f, 9.64f, 17.89f, 9.21f, 14.92f)
                lineTo(8f, 16.12f)
                lineTo(7.3f, 15.42f)
                curveTo(8f, 19.26f, 9.84f, 22f, 12f, 22f)
                curveTo(14.42f, 22f, 16.44f, 18.56f, 16.9f, 14f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 17.45f, 13.4f, 20f, 12f, 20f)
                moveTo(22f, 11f)
                horizontalLineTo(13f)
                lineTo(11f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                moveTo(2f, 13f)
                horizontalLineTo(5f)
                lineTo(3f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
            }
        }.build()

        return _HorizontalRotateCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _HorizontalRotateCounterclockwise: ImageVector? = null
