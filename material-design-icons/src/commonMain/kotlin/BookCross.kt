package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookCross: ImageVector
    get() {
        if (_BookCross != null) {
            return _BookCross!!
        }
        _BookCross = ImageVector.Builder(
            name = "BookCross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.81f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(12f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 4f)
                verticalLineTo(20f)
                curveTo(20f, 21.05f, 19.05f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.95f, 22f, 4f, 21.05f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 3f, 4.83f, 2.09f, 5.81f, 2f)
                moveTo(13f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _BookCross!!
    }

@Suppress("ObjectPropertyName")
private var _BookCross: ImageVector? = null
