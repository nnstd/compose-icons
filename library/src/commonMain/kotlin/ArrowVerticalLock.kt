package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowVerticalLock: ImageVector
    get() {
        if (_ArrowVerticalLock != null) {
            return _ArrowVerticalLock!!
        }
        _ArrowVerticalLock = ImageVector.Builder(
            name = "ArrowVerticalLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.8f, 11f)
                verticalLineTo(9.5f)
                curveTo(18.8f, 8.1f, 17.4f, 7f, 16f, 7f)
                reflectiveCurveTo(13.2f, 8.1f, 13.2f, 9.5f)
                verticalLineTo(11f)
                curveTo(12.6f, 11f, 12f, 11.6f, 12f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(12f, 16.4f, 12.6f, 17f, 13.2f, 17f)
                horizontalLineTo(18.7f)
                curveTo(19.4f, 17f, 20f, 16.4f, 20f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(20f, 11.6f, 19.4f, 11f, 18.8f, 11f)
                moveTo(17.5f, 11f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.5f)
                curveTo(14.5f, 8.7f, 15.2f, 8.2f, 16f, 8.2f)
                curveTo(16.8f, 8.2f, 17.5f, 8.7f, 17.5f, 9.5f)
                verticalLineTo(11f)
                moveTo(9f, 6f)
                horizontalLineTo(12f)
                lineTo(8f, 2f)
                lineTo(4f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                lineTo(8f, 22f)
                lineTo(12f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _ArrowVerticalLock!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowVerticalLock: ImageVector? = null
