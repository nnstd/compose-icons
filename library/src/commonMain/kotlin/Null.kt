package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Null: ImageVector
    get() {
        if (_Null != null) {
            return _Null!!
        }
        _Null = ImageVector.Builder(
            name = "Null",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.85f, 2f, 15.55f, 2.78f, 16.9f, 4.1f)
                lineTo(18.6f, 1.93f)
                lineTo(20.18f, 3.16f)
                lineTo(18.2f, 5.68f)
                curveTo(19.33f, 7.41f, 20f, 9.6f, 20f, 12f)
                curveTo(20f, 17.5f, 16.42f, 22f, 12f, 22f)
                curveTo(10.15f, 22f, 8.45f, 21.22f, 7.1f, 19.9f)
                lineTo(5.4f, 22.07f)
                lineTo(3.82f, 20.84f)
                lineTo(5.8f, 18.32f)
                curveTo(4.67f, 16.59f, 4f, 14.4f, 4f, 12f)
                curveTo(4f, 6.5f, 7.58f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(8.69f, 4f, 6f, 7.58f, 6f, 12f)
                curveTo(6f, 13.73f, 6.41f, 15.33f, 7.11f, 16.64f)
                lineTo(15.67f, 5.67f)
                curveTo(14.66f, 4.62f, 13.38f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                curveTo(15.31f, 20f, 18f, 16.42f, 18f, 12f)
                curveTo(18f, 10.27f, 17.59f, 8.67f, 16.89f, 7.36f)
                lineTo(8.33f, 18.33f)
                curveTo(9.34f, 19.38f, 10.62f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Null!!
    }

@Suppress("ObjectPropertyName")
private var _Null: ImageVector? = null
