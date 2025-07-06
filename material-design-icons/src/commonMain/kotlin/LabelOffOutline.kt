package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelOffOutline: ImageVector
    get() {
        if (_LabelOffOutline != null) {
            return _LabelOffOutline!!
        }
        _LabelOffOutline = ImageVector.Builder(
            name = "LabelOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 4.27f)
                lineTo(3.28f, 3f)
                lineTo(20f, 19.72f)
                lineTo(18.73f, 21f)
                lineTo(16.63f, 18.9f)
                curveTo(16.43f, 18.96f, 16.22f, 19f, 16f, 19f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(7f)
                curveTo(3f, 6.5f, 3.17f, 6.07f, 3.46f, 5.73f)
                lineTo(2f, 4.27f)
                moveTo(5f, 17f)
                horizontalLineTo(14.73f)
                lineTo(5f, 7.27f)
                verticalLineTo(17f)
                moveTo(19.55f, 12f)
                lineTo(16f, 7f)
                horizontalLineTo(9.82f)
                lineTo(7.83f, 5f)
                horizontalLineTo(16f)
                curveTo(16.67f, 5f, 17.27f, 5.33f, 17.63f, 5.84f)
                lineTo(22f, 12f)
                lineTo(19f, 16.2f)
                lineTo(17.59f, 14.76f)
                lineTo(19.55f, 12f)
                close()
            }
        }.build()

        return _LabelOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LabelOffOutline: ImageVector? = null
