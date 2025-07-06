package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Assistant: ImageVector
    get() {
        if (_Assistant != null) {
            return _Assistant!!
        }
        _Assistant = ImageVector.Builder(
            name = "Assistant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(9f)
                lineTo(12f, 23f)
                lineTo(15f, 20f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 2f)
                moveTo(13.88f, 12.88f)
                lineTo(12f, 17f)
                lineTo(10.12f, 12.88f)
                lineTo(6f, 11f)
                lineTo(10.12f, 9.12f)
                lineTo(12f, 5f)
                lineTo(13.88f, 9.12f)
                lineTo(18f, 11f)
            }
        }.build()

        return _Assistant!!
    }

@Suppress("ObjectPropertyName")
private var _Assistant: ImageVector? = null
