package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareEditOutline: ImageVector
    get() {
        if (_SquareEditOutline != null) {
            return _SquareEditOutline!!
        }
        _SquareEditOutline = ImageVector.Builder(
            name = "SquareEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                moveTo(17.78f, 4f)
                curveTo(17.61f, 4f, 17.43f, 4.07f, 17.3f, 4.2f)
                lineTo(16.08f, 5.41f)
                lineTo(18.58f, 7.91f)
                lineTo(19.8f, 6.7f)
                curveTo(20.06f, 6.44f, 20.06f, 6f, 19.8f, 5.75f)
                lineTo(18.25f, 4.2f)
                curveTo(18.12f, 4.07f, 17.95f, 4f, 17.78f, 4f)
                moveTo(15.37f, 6.12f)
                lineTo(8f, 13.5f)
                verticalLineTo(16f)
                horizontalLineTo(10.5f)
                lineTo(17.87f, 8.62f)
                lineTo(15.37f, 6.12f)
                close()
            }
        }.build()

        return _SquareEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SquareEditOutline: ImageVector? = null
