package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonKiss: ImageVector
    get() {
        if (_EmoticonKiss != null) {
            return _EmoticonKiss!!
        }
        _EmoticonKiss = ImageVector.Builder(
            name = "EmoticonKiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.9f, 18.94f)
                lineTo(15.94f, 16f)
                curveTo(15.76f, 15.79f, 15.55f, 15.5f, 15.55f, 15.05f)
                arcTo(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.85f, 13.75f)
                curveTo(17.19f, 13.75f, 17.53f, 13.89f, 17.77f, 14.15f)
                lineTo(18.91f, 15.26f)
                lineTo(20.03f, 14.13f)
                curveTo(20.27f, 13.89f, 20.61f, 13.75f, 20.95f, 13.75f)
                arcTo(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.25f, 15.05f)
                curveTo(22.25f, 15.39f, 22.11f, 15.73f, 21.87f, 15.97f)
                lineTo(18.9f, 18.94f)
                moveTo(17.46f, 19.62f)
                curveTo(15.72f, 21.1f, 13.47f, 22f, 11f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                curveTo(21f, 12.09f, 21f, 12.17f, 20.95f, 12.25f)
                curveTo(20.21f, 12.25f, 19.5f, 12.55f, 18.97f, 13.07f)
                lineTo(18.9f, 13.14f)
                lineTo(18.84f, 13.09f)
                curveTo(18.32f, 12.55f, 17.6f, 12.25f, 16.85f, 12.25f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.05f, 15.05f)
                curveTo(14.05f, 15.78f, 14.34f, 16.5f, 14.87f, 17.03f)
                lineTo(17.46f, 19.62f)
                moveTo(13f, 9.5f)
                curveTo(13f, 10.3f, 13.7f, 11f, 14.5f, 11f)
                curveTo(15.3f, 11f, 16f, 10.3f, 16f, 9.5f)
                curveTo(16f, 8.7f, 15.3f, 8f, 14.5f, 8f)
                curveTo(13.7f, 8f, 13f, 8.7f, 13f, 9.5f)
                moveTo(9f, 9.5f)
                curveTo(9f, 8.7f, 8.3f, 8f, 7.5f, 8f)
                curveTo(6.7f, 8f, 6f, 8.7f, 6f, 9.5f)
                curveTo(6f, 10.3f, 6.7f, 11f, 7.5f, 11f)
                curveTo(8.3f, 11f, 9f, 10.3f, 9f, 9.5f)
                moveTo(12.94f, 15.18f)
                lineTo(14f, 14.12f)
                lineTo(11.88f, 12f)
                lineTo(10.82f, 13.06f)
                lineTo(11.88f, 14.12f)
                lineTo(10.82f, 15.18f)
                lineTo(11.88f, 16.24f)
                lineTo(10.82f, 17.3f)
                lineTo(11.88f, 18.36f)
                lineTo(14f, 16.24f)
                lineTo(12.94f, 15.18f)
                close()
            }
        }.build()

        return _EmoticonKiss!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonKiss: ImageVector? = null
