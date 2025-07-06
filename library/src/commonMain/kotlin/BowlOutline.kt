package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BowlOutline: ImageVector
    get() {
        if (_BowlOutline != null) {
            return _BowlOutline!!
        }
        _BowlOutline = ImageVector.Builder(
            name = "BowlOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                verticalLineTo(15f)
                curveTo(2f, 18.9f, 5.1f, 22f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(18.9f, 22f, 22f, 18.9f, 22f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                moveTo(4f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                curveTo(20f, 17.8f, 17.8f, 20f, 15f, 20f)
                horizontalLineTo(9f)
                curveTo(6.2f, 20f, 4f, 17.8f, 4f, 15f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _BowlOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BowlOutline: ImageVector? = null
