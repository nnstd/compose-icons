package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitDetour: ImageVector
    get() {
        if (_TransitDetour != null) {
            return _TransitDetour!!
        }
        _TransitDetour = ImageVector.Builder(
            name = "TransitDetour",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.61f, 4.21f)
                arcTo(11.5f, 11.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 4f)
                lineTo(13.88f, 6f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6.13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 19f, 3f)
                moveTo(19f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                moveTo(8.86f, 7.86f)
                lineTo(7.67f, 6.25f)
                arcTo(11.5f, 11.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.6f, 4.37f)
                lineTo(12.1f, 6.31f)
                arcTo(9.5f, 9.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.86f, 7.86f)
                moveTo(21f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.69f, 16.11f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.59f, 13.46f)
                curveTo(8.37f, 13.47f, 8.16f, 13.5f, 7.94f, 13.54f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.39f, 10.06f)
                arcTo(11.54f, 11.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.04f, 7.7f)
                lineTo(7.5f, 9.06f)
                arcTo(9.34f, 9.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 10.41f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.62f, 11.56f)
                curveTo(7.91f, 11.5f, 8.19f, 11.5f, 8.5f, 11.46f)
                arcTo(11.47f, 11.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.46f, 15.05f)
                arcTo(2.96f, 2.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                close()
            }
        }.build()

        return _TransitDetour!!
    }

@Suppress("ObjectPropertyName")
private var _TransitDetour: ImageVector? = null
