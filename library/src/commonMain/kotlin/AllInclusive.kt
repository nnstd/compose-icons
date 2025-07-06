package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AllInclusive: ImageVector
    get() {
        if (_AllInclusive != null) {
            return _AllInclusive!!
        }
        _AllInclusive = ImageVector.Builder(
            name = "AllInclusive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.6f, 6.62f)
                curveTo(17.16f, 6.62f, 15.8f, 7.18f, 14.83f, 8.15f)
                lineTo(7.8f, 14.39f)
                curveTo(7.16f, 15.03f, 6.31f, 15.38f, 5.4f, 15.38f)
                curveTo(3.53f, 15.38f, 2f, 13.87f, 2f, 12f)
                curveTo(2f, 10.13f, 3.53f, 8.62f, 5.4f, 8.62f)
                curveTo(6.31f, 8.62f, 7.16f, 8.97f, 7.84f, 9.65f)
                lineTo(8.97f, 10.65f)
                lineTo(10.5f, 9.31f)
                lineTo(9.22f, 8.2f)
                curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f)
                curveTo(2.42f, 6.62f, 0f, 9.04f, 0f, 12f)
                curveTo(0f, 14.96f, 2.42f, 17.38f, 5.4f, 17.38f)
                curveTo(6.84f, 17.38f, 8.2f, 16.82f, 9.17f, 15.85f)
                lineTo(16.2f, 9.61f)
                curveTo(16.84f, 8.97f, 17.69f, 8.62f, 18.6f, 8.62f)
                curveTo(20.47f, 8.62f, 22f, 10.13f, 22f, 12f)
                curveTo(22f, 13.87f, 20.47f, 15.38f, 18.6f, 15.38f)
                curveTo(17.7f, 15.38f, 16.84f, 15.03f, 16.16f, 14.35f)
                lineTo(15f, 13.34f)
                lineTo(13.5f, 14.68f)
                lineTo(14.78f, 15.8f)
                curveTo(15.8f, 16.81f, 17.15f, 17.37f, 18.6f, 17.37f)
                curveTo(21.58f, 17.37f, 24f, 14.96f, 24f, 12f)
                curveTo(24f, 9f, 21.58f, 6.62f, 18.6f, 6.62f)
                close()
            }
        }.build()

        return _AllInclusive!!
    }

@Suppress("ObjectPropertyName")
private var _AllInclusive: ImageVector? = null
