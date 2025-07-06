package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignText: ImageVector
    get() {
        if (_SignText != null) {
            return _SignText!!
        }
        _SignText = ImageVector.Builder(
            name = "SignText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                lineTo(12f, 2f)
                lineTo(13f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(6f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                moveTo(6f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _SignText!!
    }

@Suppress("ObjectPropertyName")
private var _SignText: ImageVector? = null
