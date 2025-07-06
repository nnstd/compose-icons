package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cloud: ImageVector
    get() {
        if (_Cloud != null) {
            return _Cloud!!
        }
        _Cloud = ImageVector.Builder(
            name = "Cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 20f)
                quadTo(4.22f, 20f, 2.61f, 18.43f)
                quadTo(1f, 16.85f, 1f, 14.58f)
                quadTo(1f, 12.63f, 2.17f, 11.1f)
                quadTo(3.35f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.85f, 7.75f, 5.43f)
                quadTo(9.63f, 4f, 12f, 4f)
                quadTo(14.93f, 4f, 16.96f, 6.04f)
                quadTo(19f, 8.07f, 19f, 11f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23f, 13.78f, 23f, 15.5f)
                quadTo(23f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20f, 18.5f, 20f)
                close()
            }
        }.build()

        return _Cloud!!
    }

@Suppress("ObjectPropertyName")
private var _Cloud: ImageVector? = null
