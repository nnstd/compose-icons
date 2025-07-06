package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapCheckOutline: ImageVector
    get() {
        if (_MapCheckOutline != null) {
            return _MapCheckOutline!!
        }
        _MapCheckOutline = ImageVector.Builder(
            name = "MapCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.25f, 22f)
                lineTo(15.5f, 19f)
                lineTo(16.66f, 17.82f)
                lineTo(18.25f, 19.41f)
                lineTo(21.84f, 15.82f)
                lineTo(23f, 17.23f)
                lineTo(18.25f, 22f)
                moveTo(20.5f, 3f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.5f)
                verticalLineTo(13.34f)
                curveTo(20.37f, 13.12f, 19.7f, 13f, 19f, 13f)
                verticalLineTo(5.7f)
                lineTo(16f, 6.86f)
                verticalLineTo(13.8f)
                curveTo(15.2f, 14.27f, 14.5f, 14.91f, 14f, 15.68f)
                verticalLineTo(6.87f)
                lineTo(10f, 5.47f)
                verticalLineTo(17.13f)
                lineTo(13.05f, 18.2f)
                lineTo(13f, 19f)
                curveTo(13f, 19.46f, 13.05f, 19.92f, 13.15f, 20.35f)
                lineTo(9f, 18.9f)
                lineTo(3.66f, 20.97f)
                lineTo(3.5f, 21f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3f, 5.15f, 3.15f, 4.97f, 3.36f, 4.9f)
                lineTo(9f, 3f)
                lineTo(15f, 5.1f)
                lineTo(20.34f, 3.03f)
                lineTo(20.5f, 3f)
                moveTo(5f, 6.46f)
                verticalLineTo(18.31f)
                lineTo(8f, 17.15f)
                verticalLineTo(5.45f)
                lineTo(5f, 6.46f)
                close()
            }
        }.build()

        return _MapCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MapCheckOutline: ImageVector? = null
