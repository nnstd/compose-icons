package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookAlphabet: ImageVector
    get() {
        if (_BookAlphabet != null) {
            return _BookAlphabet!!
        }
        _BookAlphabet = ImageVector.Builder(
            name = "BookAlphabet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.81f, 2f)
                curveTo(4.83f, 2.09f, 4f, 3f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.05f, 4.95f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.05f, 22f, 20f, 21.05f, 20f, 20f)
                verticalLineTo(4f)
                curveTo(20f, 2.89f, 19.1f, 2f, 18f, 2f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(7f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(5.94f, 2f, 5.87f, 2f, 5.81f, 2f)
                moveTo(12f, 13f)
                horizontalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                moveTo(12f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(15f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                lineTo(16f, 19f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                lineTo(17f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _BookAlphabet!!
    }

@Suppress("ObjectPropertyName")
private var _BookAlphabet: ImageVector? = null
