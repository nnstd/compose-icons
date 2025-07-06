package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Xml: ImageVector
    get() {
        if (_Xml != null) {
            return _Xml!!
        }
        _Xml = ImageVector.Builder(
            name = "Xml",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.89f, 3f)
                lineTo(14.85f, 3.4f)
                lineTo(11.11f, 21f)
                lineTo(9.15f, 20.6f)
                lineTo(12.89f, 3f)
                moveTo(19.59f, 12f)
                lineTo(16f, 8.41f)
                verticalLineTo(5.58f)
                lineTo(22.42f, 12f)
                lineTo(16f, 18.41f)
                verticalLineTo(15.58f)
                lineTo(19.59f, 12f)
                moveTo(1.58f, 12f)
                lineTo(8f, 5.58f)
                verticalLineTo(8.41f)
                lineTo(4.41f, 12f)
                lineTo(8f, 15.58f)
                verticalLineTo(18.41f)
                lineTo(1.58f, 12f)
                close()
            }
        }.build()

        return _Xml!!
    }

@Suppress("ObjectPropertyName")
private var _Xml: ImageVector? = null
