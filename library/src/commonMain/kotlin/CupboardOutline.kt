package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CupboardOutline: ImageVector
    get() {
        if (_CupboardOutline != null) {
            return _CupboardOutline!!
        }
        _CupboardOutline = ImageVector.Builder(
            name = "CupboardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(19f)
                curveTo(5f, 20.11f, 5.9f, 21f, 7f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                curveTo(18.11f, 21f, 19f, 20.11f, 19f, 19f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.11f, 2f, 17f, 2f)
                horizontalLineTo(7f)
                moveTo(7f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                moveTo(7f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                moveTo(7f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                moveTo(13f, 14f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                moveTo(8f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                moveTo(14f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _CupboardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CupboardOutline: ImageVector? = null
