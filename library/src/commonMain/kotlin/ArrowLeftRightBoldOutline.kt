package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftRightBoldOutline: ImageVector
    get() {
        if (_ArrowLeftRightBoldOutline != null) {
            return _ArrowLeftRightBoldOutline!!
        }
        _ArrowLeftRightBoldOutline = ImageVector.Builder(
            name = "ArrowLeftRightBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                verticalLineTo(22f)
                lineTo(24f, 12f)
                lineTo(14f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                lineTo(0f, 12f)
                lineTo(10f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                moveTo(8f, 14f)
                verticalLineTo(17f)
                lineTo(3f, 12f)
                lineTo(8f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                lineTo(21f, 12f)
                lineTo(16f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _ArrowLeftRightBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftRightBoldOutline: ImageVector? = null
