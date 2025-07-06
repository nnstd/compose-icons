package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ladder: ImageVector
    get() {
        if (_Ladder != null) {
            return _Ladder!!
        }
        _Ladder = ImageVector.Builder(
            name = "Ladder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(14f)
                moveTo(14f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(14f)
                moveTo(14f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(10f, 18f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Ladder!!
    }

@Suppress("ObjectPropertyName")
private var _Ladder: ImageVector? = null
