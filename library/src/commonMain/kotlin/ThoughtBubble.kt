package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThoughtBubble: ImageVector
    get() {
        if (_ThoughtBubble != null) {
            return _ThoughtBubble!!
        }
        _ThoughtBubble = ImageVector.Builder(
            name = "ThoughtBubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 22f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 19f)
                moveTo(8.5f, 16f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 16f)
                moveTo(14.5f, 15f)
                curveTo(13.31f, 15f, 12.23f, 14.5f, 11.5f, 13.65f)
                curveTo(10.77f, 14.5f, 9.69f, 15f, 8.5f, 15f)
                curveTo(6.54f, 15f, 4.91f, 13.59f, 4.57f, 11.74f)
                curveTo(3.07f, 11.16f, 2f, 9.7f, 2f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 4f)
                curveTo(6.26f, 4f, 6.5f, 4.03f, 6.77f, 4.07f)
                curveTo(7.5f, 3.41f, 8.45f, 3f, 9.5f, 3f)
                curveTo(10.69f, 3f, 11.77f, 3.5f, 12.5f, 4.35f)
                curveTo(13.23f, 3.5f, 14.31f, 3f, 15.5f, 3f)
                curveTo(17.46f, 3f, 19.09f, 4.41f, 19.43f, 6.26f)
                curveTo(20.93f, 6.84f, 22f, 8.3f, 22f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 14f)
                lineTo(17.23f, 13.93f)
                curveTo(16.5f, 14.59f, 15.55f, 15f, 14.5f, 15f)
                close()
            }
        }.build()

        return _ThoughtBubble!!
    }

@Suppress("ObjectPropertyName")
private var _ThoughtBubble: ImageVector? = null
