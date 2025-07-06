package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleFit: ImageVector
    get() {
        if (_GoogleFit != null) {
            return _GoogleFit!!
        }
        _GoogleFit = ImageVector.Builder(
            name = "GoogleFit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                curveTo(22f, 10.38f, 21.44f, 11.63f, 20.54f, 12.54f)
                lineTo(12f, 21.07f)
                lineTo(3.46f, 12.54f)
                curveTo(2.56f, 11.63f, 2f, 10.38f, 2f, 9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                curveTo(8.38f, 4f, 9.63f, 4.56f, 10.54f, 5.46f)
                lineTo(12f, 6.93f)
                lineTo(13.46f, 5.46f)
                curveTo(14.37f, 4.56f, 15.62f, 4f, 17f, 4f)
                moveTo(15.59f, 7.59f)
                lineTo(9.17f, 14f)
                lineTo(12f, 16.83f)
                lineTo(18.41f, 10.41f)
                curveTo(18.78f, 10.05f, 19f, 9.55f, 19f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 7f)
                curveTo(16.45f, 7f, 15.95f, 7.22f, 15.59f, 7.59f)
                moveTo(8.41f, 7.59f)
                curveTo(8.05f, 7.22f, 7.55f, 7f, 7f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 9f)
                curveTo(5f, 9.55f, 5.22f, 10.05f, 5.59f, 10.41f)
                lineTo(7.05f, 11.88f)
                lineTo(9.88f, 9.05f)
                lineTo(8.41f, 7.59f)
                close()
            }
        }.build()

        return _GoogleFit!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleFit: ImageVector? = null
