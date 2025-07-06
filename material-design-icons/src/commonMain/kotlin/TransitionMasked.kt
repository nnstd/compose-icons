package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitionMasked: ImageVector
    get() {
        if (_TransitionMasked != null) {
            return _TransitionMasked!!
        }
        _TransitionMasked = ImageVector.Builder(
            name = "TransitionMasked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 2f)
                curveTo(16.94f, 2f, 18.59f, 2.7f, 19.95f, 4.05f)
                curveTo(21.3f, 5.41f, 22f, 7.06f, 22f, 9f)
                curveTo(22f, 10.56f, 21.5f, 11.96f, 20.58f, 13.2f)
                curveTo(19.64f, 14.43f, 18.44f, 15.27f, 16.97f, 15.7f)
                lineTo(17f, 15.38f)
                verticalLineTo(15f)
                curveTo(17f, 12.81f, 16.23f, 10.93f, 14.65f, 9.35f)
                curveTo(13.07f, 7.77f, 11.19f, 7f, 9f, 7f)
                horizontalLineTo(8.63f)
                lineTo(8.3f, 7.03f)
                curveTo(8.73f, 5.56f, 9.57f, 4.36f, 10.8f, 3.42f)
                curveTo(12.04f, 2.5f, 13.44f, 2f, 15f, 2f)
                moveTo(9f, 8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 8f)
                moveTo(9f, 10f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 10f)
                close()
            }
        }.build()

        return _TransitionMasked!!
    }

@Suppress("ObjectPropertyName")
private var _TransitionMasked: ImageVector? = null
