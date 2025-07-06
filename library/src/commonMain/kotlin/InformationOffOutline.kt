package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InformationOffOutline: ImageVector
    get() {
        if (_InformationOffOutline != null) {
            return _InformationOffOutline!!
        }
        _InformationOffOutline = ImageVector.Builder(
            name = "InformationOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(4.1f, 6f)
                curveTo(2.8f, 7.6f, 2f, 9.7f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(14.3f, 22f, 16.4f, 21.2f, 18f, 19.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(12f, 20f)
                curveTo(7.6f, 20f, 4f, 16.4f, 4f, 12f)
                curveTo(4f, 10.3f, 4.6f, 8.7f, 5.5f, 7.4f)
                lineTo(11f, 12.9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(14.9f)
                lineTo(16.6f, 18.5f)
                curveTo(15.3f, 19.4f, 13.7f, 20f, 12f, 20f)
                moveTo(8.2f, 5f)
                lineTo(6.7f, 3.5f)
                curveTo(8.3f, 2.6f, 10.1f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.9f, 21.4f, 15.7f, 20.5f, 17.3f)
                lineTo(19f, 15.8f)
                curveTo(19.6f, 14.7f, 20f, 13.4f, 20f, 12f)
                curveTo(20f, 7.6f, 16.4f, 4f, 12f, 4f)
                curveTo(10.6f, 4f, 9.3f, 4.4f, 8.2f, 5f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _InformationOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InformationOffOutline: ImageVector? = null
