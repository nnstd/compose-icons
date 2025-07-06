package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomePlusOutline: ImageVector
    get() {
        if (_HomePlusOutline != null) {
            return _HomePlusOutline!!
        }
        _HomePlusOutline = ImageVector.Builder(
            name = "HomePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(10.19f)
                lineTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                curveTo(12f, 18.7f, 12.12f, 19.37f, 12.34f, 20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HomePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomePlusOutline: ImageVector? = null
