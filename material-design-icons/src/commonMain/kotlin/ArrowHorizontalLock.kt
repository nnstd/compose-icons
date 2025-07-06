package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowHorizontalLock: ImageVector
    get() {
        if (_ArrowHorizontalLock != null) {
            return _ArrowHorizontalLock!!
        }
        _ArrowHorizontalLock = ImageVector.Builder(
            name = "ArrowHorizontalLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.8f, 7f)
                verticalLineTo(5.5f)
                curveTo(14.8f, 4.1f, 13.4f, 3f, 12f, 3f)
                reflectiveCurveTo(9.2f, 4.1f, 9.2f, 5.5f)
                verticalLineTo(7f)
                curveTo(8.6f, 7f, 8f, 7.6f, 8f, 8.2f)
                verticalLineTo(11.7f)
                curveTo(8f, 12.4f, 8.6f, 13f, 9.2f, 13f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 13f, 16f, 12.4f, 16f, 11.8f)
                verticalLineTo(8.3f)
                curveTo(16f, 7.6f, 15.4f, 7f, 14.8f, 7f)
                moveTo(13.5f, 7f)
                horizontalLineTo(10.5f)
                verticalLineTo(5.5f)
                curveTo(10.5f, 4.7f, 11.2f, 4.2f, 12f, 4.2f)
                reflectiveCurveTo(13.5f, 4.7f, 13.5f, 5.5f)
                verticalLineTo(7f)
                moveTo(6f, 17f)
                verticalLineTo(20f)
                lineTo(2f, 16f)
                lineTo(6f, 12f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                lineTo(22f, 16f)
                lineTo(18f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _ArrowHorizontalLock!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowHorizontalLock: ImageVector? = null
