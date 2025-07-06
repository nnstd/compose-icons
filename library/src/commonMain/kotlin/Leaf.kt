package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Leaf: ImageVector
    get() {
        if (_Leaf != null) {
            return _Leaf!!
        }
        _Leaf = ImageVector.Builder(
            name = "Leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8f)
                curveTo(8f, 10f, 5.9f, 16.17f, 3.82f, 21.34f)
                lineTo(5.71f, 22f)
                lineTo(6.66f, 19.7f)
                curveTo(7.14f, 19.87f, 7.64f, 20f, 8f, 20f)
                curveTo(19f, 20f, 22f, 3f, 22f, 3f)
                curveTo(21f, 5f, 14f, 5.25f, 9f, 6.25f)
                curveTo(4f, 7.25f, 2f, 11.5f, 2f, 13.5f)
                curveTo(2f, 15.5f, 3.75f, 17.25f, 3.75f, 17.25f)
                curveTo(7f, 8f, 17f, 8f, 17f, 8f)
                close()
            }
        }.build()

        return _Leaf!!
    }

@Suppress("ObjectPropertyName")
private var _Leaf: ImageVector? = null
