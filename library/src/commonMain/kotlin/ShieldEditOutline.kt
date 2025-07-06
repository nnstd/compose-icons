package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldEditOutline: ImageVector
    get() {
        if (_ShieldEditOutline != null) {
            return _ShieldEditOutline!!
        }
        _ShieldEditOutline = ImageVector.Builder(
            name = "ShieldEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.7f, 13.6f)
                lineTo(20.4f, 12.3f)
                curveTo(20.3f, 12.2f, 20.2f, 12.1f, 20f, 12.1f)
                curveTo(19.9f, 12.1f, 19.7f, 12.2f, 19.6f, 12.3f)
                lineTo(18.6f, 13.3f)
                lineTo(20.6f, 15.3f)
                lineTo(21.6f, 14.3f)
                curveTo(21.9f, 14.1f, 21.9f, 13.8f, 21.7f, 13.6f)
                moveTo(12f, 19.9f)
                verticalLineTo(22f)
                horizontalLineTo(14.1f)
                lineTo(20.2f, 15.9f)
                lineTo(18.2f, 13.8f)
                lineTo(12f, 19.9f)
                moveTo(10f, 22.3f)
                curveTo(5.9f, 20.3f, 3f, 15.8f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(8.1f)
                lineTo(19f, 10.1f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.2f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5f, 14.7f, 7.2f, 18.3f, 10f, 20.1f)
                verticalLineTo(22.3f)
                close()
            }
        }.build()

        return _ShieldEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldEditOutline: ImageVector? = null
