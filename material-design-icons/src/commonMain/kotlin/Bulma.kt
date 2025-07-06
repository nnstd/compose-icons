package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bulma: ImageVector
    get() {
        if (_Bulma != null) {
            return _Bulma!!
        }
        _Bulma = ImageVector.Builder(
            name = "Bulma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.38f, 2f)
                lineTo(6.38f, 7f)
                lineTo(5.13f, 15.75f)
                lineTo(11.38f, 22f)
                lineTo(18.88f, 17f)
                lineTo(13.88f, 12f)
                lineTo(17.63f, 8.25f)
                lineTo(11.38f, 2f)
                close()
            }
        }.build()

        return _Bulma!!
    }

@Suppress("ObjectPropertyName")
private var _Bulma: ImageVector? = null
