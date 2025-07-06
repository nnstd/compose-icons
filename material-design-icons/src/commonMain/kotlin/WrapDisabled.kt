package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WrapDisabled: ImageVector
    get() {
        if (_WrapDisabled != null) {
            return _WrapDisabled!!
        }
        _WrapDisabled = ImageVector.Builder(
            name = "WrapDisabled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                moveTo(3f, 19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(22f, 12f)
                lineTo(18f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                lineTo(22f, 12f)
                close()
            }
        }.build()

        return _WrapDisabled!!
    }

@Suppress("ObjectPropertyName")
private var _WrapDisabled: ImageVector? = null
