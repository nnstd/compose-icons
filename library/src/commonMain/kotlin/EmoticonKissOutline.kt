package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonKissOutline: ImageVector
    get() {
        if (_EmoticonKissOutline != null) {
            return _EmoticonKissOutline!!
        }
        _EmoticonKissOutline = ImageVector.Builder(
            name = "EmoticonKissOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9.5f)
                curveTo(9f, 10.3f, 8.3f, 11f, 7.5f, 11f)
                curveTo(6.7f, 11f, 6f, 10.3f, 6f, 9.5f)
                curveTo(6f, 8.7f, 6.7f, 8f, 7.5f, 8f)
                curveTo(8.3f, 8f, 9f, 8.7f, 9f, 9.5f)
                moveTo(16f, 9.5f)
                curveTo(16f, 10.3f, 15.3f, 11f, 14.5f, 11f)
                curveTo(13.7f, 11f, 13f, 10.3f, 13f, 9.5f)
                curveTo(13f, 8.7f, 13.7f, 8f, 14.5f, 8f)
                curveTo(15.3f, 8f, 16f, 8.7f, 16f, 9.5f)
                moveTo(14f, 14.12f)
                lineTo(11.88f, 12f)
                lineTo(10.82f, 13.06f)
                lineTo(11.88f, 14.12f)
                lineTo(10.82f, 15.18f)
                lineTo(11.88f, 16.24f)
                lineTo(10.82f, 17.3f)
                lineTo(11.88f, 18.36f)
                lineTo(14f, 16.24f)
                lineTo(12.94f, 15.18f)
                lineTo(14f, 14.12f)
                moveTo(16.85f, 13f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.8f, 15.05f)
                curveTo(14.8f, 15.62f, 15.03f, 16.12f, 15.4f, 16.5f)
                lineTo(18.9f, 20f)
                lineTo(22.4f, 16.5f)
                curveTo(22.77f, 16.13f, 23f, 15.61f, 23f, 15.05f)
                arcTo(2.05f, 2.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.95f, 13f)
                curveTo(20.4f, 13f, 19.87f, 13.23f, 19.5f, 13.6f)
                lineTo(18.9f, 14.2f)
                lineTo(18.3f, 13.61f)
                curveTo(17.93f, 13.23f, 17.4f, 13f, 16.85f, 13f)
                moveTo(15f, 18.92f)
                curveTo(13.82f, 19.6f, 12.46f, 20f, 11f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                curveTo(15.26f, 4f, 18.73f, 7.33f, 19f, 11.5f)
                curveTo(19.58f, 11.19f, 20.26f, 11f, 20.95f, 11f)
                curveTo(20.45f, 5.95f, 16.18f, 2f, 11f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 22f)
                curveTo(13f, 22f, 14.88f, 21.4f, 16.45f, 20.38f)
                lineTo(15f, 18.92f)
                close()
            }
        }.build()

        return _EmoticonKissOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonKissOutline: ImageVector? = null
