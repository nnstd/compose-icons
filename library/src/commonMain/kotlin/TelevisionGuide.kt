package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionGuide: ImageVector
    get() {
        if (_TelevisionGuide != null) {
            return _TelevisionGuide!!
        }
        _TelevisionGuide = ImageVector.Builder(
            name = "TelevisionGuide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 17f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                horizontalLineTo(21f)
                moveTo(5f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(5f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(13f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(13f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TelevisionGuide!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionGuide: ImageVector? = null
