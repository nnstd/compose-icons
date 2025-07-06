package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsDiamondOutline: ImageVector
    get() {
        if (_CardsDiamondOutline != null) {
            return _CardsDiamondOutline!!
        }
        _CardsDiamondOutline = ImageVector.Builder(
            name = "CardsDiamondOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(5f, 12f)
                lineTo(12f, 22f)
                lineTo(19f, 12f)
                moveTo(7.44f, 12f)
                lineTo(12f, 5.5f)
                lineTo(16.56f, 12f)
                lineTo(12f, 18.5f)
            }
        }.build()

        return _CardsDiamondOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsDiamondOutline: ImageVector? = null
