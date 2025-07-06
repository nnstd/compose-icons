package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ansible: ImageVector
    get() {
        if (_Ansible != null) {
            return _Ansible!!
        }
        _Ansible = ImageVector.Builder(
            name = "Ansible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(16.1f, 17f)
                curveTo(15.91f, 17f, 15.76f, 16.9f, 15.55f, 16.73f)
                lineTo(10.39f, 12.56f)
                lineTo(8.66f, 16.9f)
                horizontalLineTo(7.17f)
                lineTo(11.54f, 6.39f)
                curveTo(11.65f, 6.11f, 11.89f, 5.97f, 12.17f, 5.97f)
                curveTo(12.45f, 5.97f, 12.67f, 6.11f, 12.79f, 6.39f)
                lineTo(16.77f, 15.97f)
                curveTo(16.81f, 16.08f, 16.84f, 16.19f, 16.84f, 16.26f)
                curveTo(16.83f, 16.68f, 16.5f, 17f, 16.1f, 17f)
                moveTo(12.17f, 8.11f)
                lineTo(14.76f, 14.5f)
                lineTo(10.85f, 11.42f)
                lineTo(12.17f, 8.11f)
                close()
            }
        }.build()

        return _Ansible!!
    }

@Suppress("ObjectPropertyName")
private var _Ansible: ImageVector? = null
