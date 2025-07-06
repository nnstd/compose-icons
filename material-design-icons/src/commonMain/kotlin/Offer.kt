package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Offer: ImageVector
    get() {
        if (_Offer != null) {
            return _Offer!!
        }
        _Offer = ImageVector.Builder(
            name = "Offer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13f)
                curveTo(21.6f, 13f, 22.1f, 13.2f, 22.4f, 13.6f)
                curveTo(22.8f, 14f, 23f, 14.5f, 23f, 15f)
                lineTo(15f, 18f)
                lineTo(8f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(9.9f)
                lineTo(17.2f, 9.7f)
                curveTo(17.7f, 9.9f, 18f, 10.3f, 18f, 10.8f)
                curveTo(18f, 11.1f, 17.9f, 11.4f, 17.7f, 11.6f)
                curveTo(17.5f, 11.8f, 17.2f, 12f, 16.8f, 12f)
                horizontalLineTo(14f)
                lineTo(12.3f, 11.3f)
                lineTo(12f, 12.2f)
                lineTo(14f, 13f)
                horizontalLineTo(21f)
                moveTo(2f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _Offer!!
    }

@Suppress("ObjectPropertyName")
private var _Offer: ImageVector? = null
