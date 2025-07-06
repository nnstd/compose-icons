package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Creation: ImageVector
    get() {
        if (_Creation != null) {
            return _Creation!!
        }
        _Creation = ImageVector.Builder(
            name = "Creation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 1f)
                lineTo(17.74f, 3.75f)
                lineTo(15f, 5f)
                lineTo(17.74f, 6.26f)
                lineTo(19f, 9f)
                lineTo(20.25f, 6.26f)
                lineTo(23f, 5f)
                lineTo(20.25f, 3.75f)
                moveTo(9f, 4f)
                lineTo(6.5f, 9.5f)
                lineTo(1f, 12f)
                lineTo(6.5f, 14.5f)
                lineTo(9f, 20f)
                lineTo(11.5f, 14.5f)
                lineTo(17f, 12f)
                lineTo(11.5f, 9.5f)
                moveTo(19f, 15f)
                lineTo(17.74f, 17.74f)
                lineTo(15f, 19f)
                lineTo(17.74f, 20.25f)
                lineTo(19f, 23f)
                lineTo(20.25f, 20.25f)
                lineTo(23f, 19f)
                lineTo(20.25f, 17.74f)
            }
        }.build()

        return _Creation!!
    }

@Suppress("ObjectPropertyName")
private var _Creation: ImageVector? = null
