package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DogSideOff: ImageVector
    get() {
        if (_DogSideOff != null) {
            return _DogSideOff!!
        }
        _DogSideOff = ImageVector.Builder(
            name = "DogSideOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                lineTo(15f, 7f)
                lineTo(19f, 3f)
                verticalLineTo(5f)
                lineTo(22f, 8f)
                lineTo(20f, 10f)
                lineTo(19f, 9f)
                lineTo(18f, 10f)
                moveTo(17f, 11f)
                lineTo(14f, 8f)
                lineTo(13f, 9f)
                horizontalLineTo(12.2f)
                lineTo(17f, 13.8f)
                verticalLineTo(11f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(7.11f, 9f)
                horizontalLineTo(5f)
                lineTo(3f, 7f)
                lineTo(2f, 8f)
                lineTo(5f, 11f)
                verticalLineTo(14f)
                lineTo(4f, 15f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                lineTo(8f, 15f)
                horizontalLineTo(13.11f)
                lineTo(15f, 16.89f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(18.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _DogSideOff!!
    }

@Suppress("ObjectPropertyName")
private var _DogSideOff: ImageVector? = null
