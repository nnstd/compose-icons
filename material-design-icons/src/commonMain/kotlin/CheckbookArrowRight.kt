package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckbookArrowRight: ImageVector
    get() {
        if (_CheckbookArrowRight != null) {
            return _CheckbookArrowRight!!
        }
        _CheckbookArrowRight = ImageVector.Builder(
            name = "CheckbookArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 14f)
                horizontalLineTo(15.53f)
                curveTo(15.25f, 14.31f, 15f, 14.64f, 14.8f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                moveTo(21f, 8f)
                verticalLineTo(12.08f)
                curveTo(21.72f, 12.2f, 22.39f, 12.45f, 23f, 12.8f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(19f)
                horizontalLineTo(14.08f)
                curveTo(14.03f, 18.68f, 14f, 18.34f, 14f, 18f)
                curveTo(14f, 17.66f, 14.03f, 17.33f, 14.08f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                moveTo(5f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                moveTo(24f, 18f)
                lineTo(21f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                lineTo(24f, 18f)
                close()
            }
        }.build()

        return _CheckbookArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _CheckbookArrowRight: ImageVector? = null
