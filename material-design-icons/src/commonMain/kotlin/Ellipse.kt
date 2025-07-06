package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ellipse: ImageVector
    get() {
        if (_Ellipse != null) {
            return _Ellipse!!
        }
        _Ellipse = ImageVector.Builder(
            name = "Ellipse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(6.5f, 4f, 2f, 7.58f, 2f, 12f)
                curveTo(2f, 16.42f, 6.5f, 20f, 12f, 20f)
                curveTo(17.5f, 20f, 22f, 16.42f, 22f, 12f)
                curveTo(22f, 7.58f, 17.5f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _Ellipse!!
    }

@Suppress("ObjectPropertyName")
private var _Ellipse: ImageVector? = null
