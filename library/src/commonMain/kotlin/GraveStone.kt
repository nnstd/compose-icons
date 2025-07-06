package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GraveStone: ImageVector
    get() {
        if (_GraveStone != null) {
            return _GraveStone!!
        }
        _GraveStone = ImageVector.Builder(
            name = "GraveStone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                horizontalLineTo(14f)
                curveTo(17.31f, 2f, 19f, 4.69f, 19f, 8f)
                verticalLineTo(18.66f)
                curveTo(16.88f, 17.63f, 15.07f, 17f, 12f, 17f)
                curveTo(8.93f, 17f, 7.12f, 17.63f, 5f, 18.66f)
                verticalLineTo(8f)
                curveTo(5f, 4.69f, 6.69f, 2f, 10f, 2f)
                moveTo(8f, 8f)
                verticalLineTo(9.5f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                moveTo(9f, 12f)
                verticalLineTo(13.5f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                moveTo(3f, 22f)
                verticalLineTo(21.31f)
                curveTo(5.66f, 19.62f, 13.23f, 15.84f, 21f, 21.25f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _GraveStone!!
    }

@Suppress("ObjectPropertyName")
private var _GraveStone: ImageVector? = null
