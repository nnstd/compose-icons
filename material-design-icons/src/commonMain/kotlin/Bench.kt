package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bench: ImageVector
    get() {
        if (_Bench != null) {
            return _Bench!!
        }
        _Bench = ImageVector.Builder(
            name = "Bench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Bench!!
    }

@Suppress("ObjectPropertyName")
private var _Bench: ImageVector? = null
