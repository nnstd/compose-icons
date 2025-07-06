package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckerboardPlus: ImageVector
    get() {
        if (_CheckerboardPlus != null) {
            return _CheckerboardPlus!!
        }
        _CheckerboardPlus = ImageVector.Builder(
            name = "CheckerboardPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
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
                horizontalLineTo(19f)
                verticalLineTo(17f)
                moveTo(8f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                moveTo(12f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                moveTo(2f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(13.54f)
                curveTo(13f, 21.42f, 12.63f, 20.74f, 12.36f, 20f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(12.36f)
                curveTo(20.74f, 12.63f, 21.42f, 13f, 22f, 13.54f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _CheckerboardPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CheckerboardPlus: ImageVector? = null
