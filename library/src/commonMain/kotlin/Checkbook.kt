package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Checkbook: ImageVector
    get() {
        if (_Checkbook != null) {
            return _Checkbook!!
        }
        _Checkbook = ImageVector.Builder(
            name = "Checkbook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                moveTo(21f, 17f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                moveTo(1f, 5f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                moveTo(5f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Checkbook!!
    }

@Suppress("ObjectPropertyName")
private var _Checkbook: ImageVector? = null
