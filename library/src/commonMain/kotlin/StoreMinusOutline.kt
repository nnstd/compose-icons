package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StoreMinusOutline: ImageVector
    get() {
        if (_StoreMinusOutline != null) {
            return _StoreMinusOutline!!
        }
        _StoreMinusOutline = ImageVector.Builder(
            name = "StoreMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(15.69f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(15.69f)
                curveTo(13.37f, 16.64f, 13f, 17.77f, 13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(4f, 7f)
                horizontalLineTo(20f)
                lineTo(21f, 12f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13f, 19f, 13f)
                curveTo(17.77f, 13f, 16.64f, 13.37f, 15.69f, 14f)
                moveTo(12f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(18.96f, 12f)
                lineTo(18.36f, 9f)
                horizontalLineTo(5.64f)
                lineTo(5.04f, 12f)
                horizontalLineTo(18.96f)
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _StoreMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StoreMinusOutline: ImageVector? = null
