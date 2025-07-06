package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Terraform: ImageVector
    get() {
        if (_Terraform != null) {
            return _Terraform!!
        }
        _Terraform = ImageVector.Builder(
            name = "Terraform",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5.4f)
                verticalLineTo(11.8f)
                lineTo(15.4f, 15f)
                verticalLineTo(8.7f)
                lineTo(21f, 5.4f)
                moveTo(14.8f, 8.7f)
                verticalLineTo(15f)
                lineTo(9.2f, 11.8f)
                verticalLineTo(5.4f)
                lineTo(14.8f, 8.7f)
                moveTo(14.8f, 15.7f)
                verticalLineTo(22.1f)
                lineTo(9.2f, 18.9f)
                verticalLineTo(12.5f)
                lineTo(14.8f, 15.7f)
                moveTo(8.6f, 5.1f)
                verticalLineTo(11.5f)
                lineTo(3f, 8.3f)
                verticalLineTo(1.9f)
                lineTo(8.6f, 5.1f)
                close()
            }
        }.build()

        return _Terraform!!
    }

@Suppress("ObjectPropertyName")
private var _Terraform: ImageVector? = null
