package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBoldHexagonOutline: ImageVector
    get() {
        if (_ArrowRightBoldHexagonOutline != null) {
            return _ArrowRightBoldHexagonOutline!!
        }
        _ArrowRightBoldHexagonOutline = ImageVector.Builder(
            name = "ArrowRightBoldHexagonOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                lineTo(12f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
                lineTo(17f, 12f)
                moveTo(21f, 16.5f)
                curveTo(21f, 16.88f, 20.79f, 17.21f, 20.47f, 17.38f)
                lineTo(12.57f, 21.82f)
                curveTo(12.41f, 21.94f, 12.21f, 22f, 12f, 22f)
                curveTo(11.79f, 22f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(3.53f, 17.38f)
                curveTo(3.21f, 17.21f, 3f, 16.88f, 3f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(3f, 7.12f, 3.21f, 6.79f, 3.53f, 6.62f)
                lineTo(11.43f, 2.18f)
                curveTo(11.59f, 2.06f, 11.79f, 2f, 12f, 2f)
                curveTo(12.21f, 2f, 12.41f, 2.06f, 12.57f, 2.18f)
                lineTo(20.47f, 6.62f)
                curveTo(20.79f, 6.79f, 21f, 7.12f, 21f, 7.5f)
                verticalLineTo(16.5f)
                moveTo(12f, 4.15f)
                lineTo(5f, 8.09f)
                verticalLineTo(15.91f)
                lineTo(12f, 19.85f)
                lineTo(19f, 15.91f)
                verticalLineTo(8.09f)
                lineTo(12f, 4.15f)
                close()
            }
        }.build()

        return _ArrowRightBoldHexagonOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBoldHexagonOutline: ImageVector? = null
