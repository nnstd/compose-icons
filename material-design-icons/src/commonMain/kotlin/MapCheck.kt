package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapCheck: ImageVector
    get() {
        if (_MapCheck != null) {
            return _MapCheck!!
        }
        _MapCheck = ImageVector.Builder(
            name = "MapCheck",
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
                moveTo(20.5f, 3f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.5f)
                verticalLineTo(13.36f)
                curveTo(20.36f, 13.13f, 19.69f, 13f, 19f, 13f)
                curveTo(17.46f, 13f, 16.06f, 13.6f, 15f, 14.56f)
                verticalLineTo(7.1f)
                lineTo(9f, 5f)
                verticalLineTo(16.9f)
                lineTo(13.04f, 18.3f)
                curveTo(13f, 18.54f, 13f, 18.77f, 13f, 19f)
                curveTo(13f, 19.46f, 13.06f, 19.92f, 13.16f, 20.36f)
                lineTo(9f, 18.9f)
                lineTo(3.66f, 20.97f)
                curveTo(3.59f, 21f, 3.55f, 21f, 3.5f, 21f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3f, 5.15f, 3.16f, 4.97f, 3.35f, 4.9f)
                lineTo(9f, 3f)
                lineTo(15f, 5.1f)
                lineTo(20.33f, 3f)
            }
        }.build()

        return _MapCheck!!
    }

@Suppress("ObjectPropertyName")
private var _MapCheck: ImageVector? = null
