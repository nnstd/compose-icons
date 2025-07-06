package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TargetVariant: ImageVector
    get() {
        if (_TargetVariant != null) {
            return _TargetVariant!!
        }
        _TargetVariant = ImageVector.Builder(
            name = "TargetVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.08f, 11.04f)
                horizontalLineTo(20.08f)
                verticalLineTo(4f)
                horizontalLineTo(13.05f)
                verticalLineTo(2f)
                horizontalLineTo(11.04f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(11.04f)
                horizontalLineTo(2f)
                verticalLineTo(13.05f)
                horizontalLineTo(4f)
                verticalLineTo(20.08f)
                horizontalLineTo(11.04f)
                verticalLineTo(22.08f)
                horizontalLineTo(13.05f)
                verticalLineTo(20.08f)
                horizontalLineTo(20.08f)
                verticalLineTo(13.05f)
                horizontalLineTo(22.08f)
                verticalLineTo(11.04f)
                moveTo(18.07f, 18.07f)
                horizontalLineTo(13.05f)
                verticalLineTo(16.06f)
                horizontalLineTo(11.04f)
                verticalLineTo(18.07f)
                horizontalLineTo(6f)
                verticalLineTo(13.05f)
                horizontalLineTo(8.03f)
                verticalLineTo(11.04f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(11.04f)
                verticalLineTo(8.03f)
                horizontalLineTo(13.05f)
                verticalLineTo(6f)
                horizontalLineTo(18.07f)
                verticalLineTo(11.04f)
                horizontalLineTo(16.06f)
                verticalLineTo(13.05f)
                horizontalLineTo(18.07f)
                verticalLineTo(18.07f)
                moveTo(13.05f, 12.05f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.05f, 13.05f)
                curveTo(11.5f, 13.05f, 11.04f, 12.6f, 11.04f, 12.05f)
                curveTo(11.04f, 11.5f, 11.5f, 11.04f, 12.05f, 11.04f)
                curveTo(12.6f, 11.04f, 13.05f, 11.5f, 13.05f, 12.05f)
                close()
            }
        }.build()

        return _TargetVariant!!
    }

@Suppress("ObjectPropertyName")
private var _TargetVariant: ImageVector? = null
