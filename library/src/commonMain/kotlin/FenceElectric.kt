package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FenceElectric: ImageVector
    get() {
        if (_FenceElectric != null) {
            return _FenceElectric!!
        }
        _FenceElectric = ImageVector.Builder(
            name = "FenceElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                moveTo(3f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(7f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                moveTo(11f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(7f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                lineTo(17f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                lineTo(7f, 4f)
                close()
            }
        }.build()

        return _FenceElectric!!
    }

@Suppress("ObjectPropertyName")
private var _FenceElectric: ImageVector? = null
