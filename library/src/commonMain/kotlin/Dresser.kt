package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dresser: ImageVector
    get() {
        if (_Dresser != null) {
            return _Dresser!!
        }
        _Dresser = ImageVector.Builder(
            name = "Dresser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                curveTo(22f, 3.9f, 21.11f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                moveTo(10f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                moveTo(2f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(10f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                moveTo(2f, 15f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                moveTo(10f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Dresser!!
    }

@Suppress("ObjectPropertyName")
private var _Dresser: ImageVector? = null
