package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Baby: ImageVector
    get() {
        if (_Baby != null) {
            return _Baby!!
        }
        _Baby = ImageVector.Builder(
            name = "Baby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 4f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 4f)
                moveTo(4.5f, 20f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 17f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 20f)
                horizontalLineTo(4.5f)
                moveTo(16.09f, 19f)
                lineTo(14.69f, 15f)
                horizontalLineTo(11f)
                lineTo(6.75f, 10.75f)
                curveTo(6.75f, 10.75f, 9f, 8.25f, 12.5f, 8.25f)
                curveTo(15.5f, 8.25f, 15.85f, 9.25f, 16.06f, 9.87f)
                lineTo(18.92f, 18f)
                curveTo(19.2f, 18.78f, 18.78f, 19.64f, 18f, 19.92f)
                curveTo(17.22f, 20.19f, 16.36f, 19.78f, 16.09f, 19f)
                close()
            }
        }.build()

        return _Baby!!
    }

@Suppress("ObjectPropertyName")
private var _Baby: ImageVector? = null
