package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreOutline: ImageVector
    get() {
        if (_StoreOutline != null) {
            return _StoreOutline!!
        }
        _StoreOutline = ImageVector.Builder(
            name = "StoreOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.36f, 9f)
                lineTo(18.96f, 12f)
                horizontalLineTo(5.04f)
                lineTo(5.64f, 9f)
                horizontalLineTo(18.36f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(20f, 7f)
                horizontalLineTo(4f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                lineTo(20f, 7f)
                moveTo(6f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _StoreOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreOutline: ImageVector? = null
