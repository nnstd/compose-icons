package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RepeatVariant: ImageVector
    get() {
        if (_RepeatVariant != null) {
            return _RepeatVariant!!
        }
        _RepeatVariant = ImageVector.Builder(
            name = "RepeatVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5.75f)
                lineTo(10.25f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(13.5f)
                lineTo(15.5f, 18f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16f)
                verticalLineTo(10f)
                horizontalLineTo(1.75f)
                lineTo(6f, 5.75f)
                moveTo(18f, 18.25f)
                lineTo(13.75f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                lineTo(8.5f, 6f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8f)
                verticalLineTo(14f)
                horizontalLineTo(22.25f)
                lineTo(18f, 18.25f)
                close()
            }
        }.build()

        return _RepeatVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatVariant: ImageVector? = null
