package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandExtended: ImageVector
    get() {
        if (_HandExtended != null) {
            return _HandExtended!!
        }
        _HandExtended = ImageVector.Builder(
            name = "HandExtended",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13f)
                curveTo(20.6f, 13f, 21.1f, 13.2f, 21.5f, 13.6f)
                curveTo(21.8f, 14f, 22f, 14.5f, 22f, 15f)
                lineTo(14f, 18f)
                lineTo(7f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(8.9f)
                lineTo(16.2f, 9.7f)
                curveTo(16.7f, 9.9f, 17f, 10.3f, 17f, 10.8f)
                curveTo(17f, 11.1f, 16.9f, 11.4f, 16.7f, 11.6f)
                reflectiveCurveTo(16.1f, 12f, 15.8f, 12f)
                horizontalLineTo(13f)
                lineTo(11.2f, 11.3f)
                lineTo(10.9f, 12.2f)
                lineTo(13f, 13f)
                horizontalLineTo(20f)
                moveTo(1f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _HandExtended!!
    }

@Suppress("ObjectPropertyName")
private var _HandExtended: ImageVector? = null
