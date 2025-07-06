package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DogSide: ImageVector
    get() {
        if (_DogSide != null) {
            return _DogSide!!
        }
        _DogSide = ImageVector.Builder(
            name = "DogSide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                lineTo(15f, 7f)
                lineTo(18f, 10f)
                lineTo(19f, 9f)
                lineTo(20f, 10f)
                lineTo(22f, 8f)
                lineTo(19f, 5f)
                verticalLineTo(3f)
                moveTo(3f, 7f)
                lineTo(2f, 8f)
                lineTo(5f, 11f)
                verticalLineTo(14f)
                lineTo(4f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                lineTo(8f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                lineTo(14f, 8f)
                lineTo(13f, 9f)
                horizontalLineTo(5f)
                lineTo(3f, 7f)
                close()
            }
        }.build()

        return _DogSide!!
    }

@Suppress("ObjectPropertyName")
private var _DogSide: ImageVector? = null
